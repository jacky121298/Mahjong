package database_utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import record_data.Game;

public class GameDataHandler {

	private static String tableName = "game_data";
	
	public static String getTableName() {
		return tableName;
	}
	
	/** Sets name of table for game data. Then use createGameDataTable() to create table.
	 * @param tableName String
	 */
	public static void setTableName(String tableName) {
		String tbnt = tableName.trim();
		if(tbnt == "" || tbnt == null) {
			System.err.println("Table name cannot be empty.");
			return;
		}
		GameDataHandler.tableName = tbnt;
	}
	
	/** Generates an empty table for game data. Default table name: "game_data".
	 * @return Boolean. True if succeeded.
	 */
	public static boolean createGameDataTable() {
		
		boolean res = false;
		
		String SQ = "CREATE TABLE IF NOT EXISTS " + GameDataHandler.getTableName()
			+ "(date              text,"	
			+ " game_number        int,"
        	+ " round_number       int,"
        	+ " draw               int,"
        	+ " winner             int,"
        	+ " chunker            int,"
        	+ " self_draw          int,"
        	+ " han               text,"
        	+ " fu                 int,"
        	+ " p_1               text,"
        	+ " p_2               text,"
        	+ " p_3               text,"
        	+ " p_4               text,"
        	+ " tp_1               int,"
        	+ " tp_2               int,"
        	+ " tp_3               int,"
        	+ " tp_4               int,"
        	+ " dp_1               int,"
        	+ " dp_2               int,"
        	+ " dp_3               int,"
        	+ " dp_4               int,"
        	+ " richi_1            int,"
        	+ " richi_2            int,"
        	+ " richi_3            int,"
        	+ " richi_4            int,"
        	+ " ready_1            int,"
        	+ " ready_2            int,"
        	+ " ready_3            int,"
        	+ " ready_4            int)";
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			con = DB_Connection.getConnection();
			
			stmt = con.prepareStatement(SQ);
			stmt.executeUpdate();
			System.out.println("Table " + GameDataHandler.getTableName() + " has been created.");
			
			if(stmt != null) stmt.close();
			if(con != null) con.close();
		}
		catch(Exception e) {
			System.err.print(e);
			return res;
		}
		
		res = true;
		return res;
	}
	
	/** Deletes table of game data.
	 * @return Boolean. True if succeeded.
	 */
	public static boolean deleteGameDataTable() {
		boolean res = false;
		String SQ = "DROP TABLE " + GameDataHandler.getTableName();
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DB_Connection.getConnection();
			
			stmt = con.prepareStatement(SQ);
			stmt.executeUpdate();
			System.out.println("Table " + GameDataHandler.getTableName() + " has been deleted.");
			
			if(stmt != null) stmt.close();
			if(con != null) con.close();
		}
		catch(Exception e) {
			System.err.print(e);
			return res;
		}
		res = true;
		return res;
	}
	
	/** Deletes all of the records in game data table.
	 * @return Boolean. True if succeeded.
	 */
	public static boolean deleteAllGameData() {
		boolean res = false;
		String SQ = "TRUNCATE TABLE " + GameDataHandler.getTableName();
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DB_Connection.getConnection();
			
			stmt = con.prepareStatement(SQ);
			stmt.executeUpdate();
			
			if(stmt != null) stmt.close();
			if(con != null) con.close();
		}
		catch(Exception e) {
			System.err.print(e);
			return res;
		}
		res = true;
		return res;
	}
	
	/** Adds a record of game data to database according to a Game instance.
	 * @param g Game instance
	 * @return Boolean. True if succeeded.
	 */
	public static boolean addGameData(Game g) {
		
		boolean res = false;
		String tbName = GameDataHandler.getTableName();	
		
		String SQ = "INSERT INTO " + tbName
			+ " (date, game_number, round_number, draw, winner, chunker, self_draw,"
			+ " han, fu, p_1, p_2, p_3, p_4, tp_1, tp_2, tp_3, tp_4, dp_1, dp_2, dp_3, dp_4,"
			+ " richi_1, richi_2, richi_3, richi_4, ready_1, ready_2, ready_3, ready_4)"
			+ " VALUES ("
			+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?"
			+ " )";
		
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			con = DB_Connection.getConnection();
			
			stmt = con.prepareStatement(SQ);
			stmt.setString(1, g.getDate().toString());  // date
			stmt.setInt(2, g.getGameNumber());  // game number
			stmt.setInt(3, g.getRoundNumber());  // round number
			int draw = g.isDraw() ? 1 : 0;  // draw
			stmt.setInt(4, draw);
			stmt.setInt(5, g.getWinner());  // winner
			stmt.setInt(6, g.getChunker()); // chunker
			int selfDraw = g.isSelfDraw() ? 1 : 0;  // self draw
			stmt.setInt(7, selfDraw);
			stmt.setString(8, g.getHan());  // han
			stmt.setInt(9, g.getFu());   // fu
			
			String[] players = g.getPlayer();  // players
			stmt.setString(10, players[0]);
			stmt.setString(11, players[1]);
			stmt.setString(12, players[2]);
			stmt.setString(13, players[3]);
			
			int[] TPs = g.getTotalPoints();  // total points
			stmt.setInt(14, TPs[0]);
			stmt.setInt(15, TPs[1]);
			stmt.setInt(16, TPs[2]);
			stmt.setInt(17, TPs[3]);
			
			int[] DPs = g.getDeltaPoints();  // delta points
			stmt.setInt(18, DPs[0]);
			stmt.setInt(19, DPs[1]);
			stmt.setInt(20, DPs[2]);
			stmt.setInt(21, DPs[3]);
			
			boolean[] isRichis = g.getIsRichi();  // is richi
			int ric_1 = isRichis[0] ? 1 : 0;
			stmt.setInt(22, ric_1);
			int ric_2 = isRichis[1] ? 1 : 0;
			stmt.setInt(23, ric_2);
			int ric_3 = isRichis[2] ? 1 : 0;
			stmt.setInt(24, ric_3);
			int ric_4 = isRichis[3] ? 1 : 0;
			stmt.setInt(25, ric_4);
			
			boolean[] isReadys = g.getReady();  // is ready
			int ready_1 = isReadys[0] ? 1 : 0;
			stmt.setInt(26, ready_1);
			int ready_2 = isReadys[1] ? 1 : 0;
			stmt.setInt(27, ready_2);
			int ready_3 = isReadys[2] ? 1 : 0;
			stmt.setInt(28, ready_3);
			int ready_4 = isReadys[3] ? 1 : 0;
			stmt.setInt(29, ready_4);
			
			stmt.executeUpdate();
			
			if(stmt != null) stmt.close();
			if(con != null) con.close();
		}
		catch(Exception e) {
			System.err.print(e);
			return res;
		}
		
		res = true;
		return res;
	}
	
	/** Gets data from ResultSet.
	 * @param rs ResultSet
	 * @return Game
	 */
	public static ArrayList<Game> getGamesFromResultSet(ResultSet rs) throws SQLException {
		
		ArrayList<Game> games = new ArrayList<Game>();

		rs.beforeFirst();
		while(rs.next()) {
			Game g = new Game();
			
			g.setDate(rs.getDate("date").toLocalDate());
			g.setGameNumber(rs.getInt("game_number"));
			g.setRoundNumber(rs.getInt("round_number"));
			int draw = rs.getInt("draw");
			if (draw == 1) g.setDraw(true);
			else           g.setDraw(false);
			g.setWinner(rs.getInt("winner"));
			g.setChunker(rs.getInt("chunker"));
			int selfdraw = rs.getInt("self_draw");
			if (selfdraw == 1) g.setSelfDraw(true);
			else               g.setSelfDraw(false);
			g.setHan(rs.getString("han"));
			g.setFu(rs.getInt("fu"));
			
			String[] players = new String[4];
			players[0] = rs.getString("p_1");
			players[1] = rs.getString("p_2");
			players[2] = rs.getString("p_3");
			players[3] = rs.getString("p_4");
			g.setPlayer(players);
			
			int[] TPs = new int[4];
			TPs[0] = rs.getInt("tp_1");
			TPs[1] = rs.getInt("tp_2");
			TPs[2] = rs.getInt("tp_3");
			TPs[3] = rs.getInt("tp_4");
			g.setTotalPoints(TPs);
			
			int[] DPs = new int[4];
			DPs[0] = rs.getInt("dp_1");
			DPs[1] = rs.getInt("dp_2");
			DPs[2] = rs.getInt("dp_3");
			DPs[3] = rs.getInt("dp_4");
			g.setDeltaPoints(DPs);
			
			boolean[] isRichis = new boolean[4];
			isRichis[0] = (rs.getInt("richi_1") == 1);
			isRichis[1] = (rs.getInt("richi_2") == 1);
			isRichis[2] = (rs.getInt("richi_3") == 1);
			isRichis[3] = (rs.getInt("richi_4") == 1);
			g.setIsRichi(isRichis);
			
			boolean[] isReadys = new boolean[4];
			isReadys[0] = (rs.getInt("ready_1") == 1);
			isReadys[1] = (rs.getInt("ready_2") == 1);
			isReadys[2] = (rs.getInt("ready_3") == 1);
			isReadys[3] = (rs.getInt("ready_4") == 1);
			
			games.add(g);
		}		
		
		return games;
	}
	
	
	/** Gets games from database according to different criteria.
	 * @param player String, put null if not specifying player
	 * @param startYear Integer, put negative value if not specifying lower bound of date
	 * @param startMonth Integer
	 * @param StartDay Integer
	 * @param endYear Integer, put negative value if not specifying upper bound of date
	 * @param endMonth Integer
	 * @param endDay Integer
	 * @param gameNumber Integer, put negative value if not specifying game number
	 * @param roundNumber Integer, put negative value if not specifying round number
	 * @return OrderData, null if not found.
	 */
	public static ArrayList<Game> getResultFromDatabase(String player, int startYear, int startMonth, int StartDay,
			int endYear, int endMonth, int endDay, int gameNumber, int roundNumber) {
		
		ArrayList<Game> games = null;
		
		String tbName = GameDataHandler.getTableName();
		String sd = null;
		if(startYear >= 0)
			sd = String.format("%04d-%02d-%02d", startYear, startMonth, StartDay);
		String ed = null;
		if(endYear >= 0)
			ed = String.format("%04d-%02d-%02d", endYear, endMonth, endDay);
		
		String SQ = "SELECT * FROM " + tbName;
		
		if (!(player == null && startYear < 0 && endYear < 0 && gameNumber < 0 && roundNumber < 0)) {
			SQ += " WHERE TRUE";
		}
		if (player != null) {
			SQ += " AND (p_1 = '" + player + "' OR p_2 = '" + player + "' OR p_3 = '" + player
					+ "' OR p_4 = '" + player + "')";
		}
		if (sd != null) {
			SQ += " AND date >= '" + sd + "'";
		}
		if (ed != null) {
			SQ += " AND date <= '" + ed + "'";
		}
		if (gameNumber >= 0) {
			SQ += " AND game_number = " + gameNumber;
		}
		if (roundNumber >= 0) {
			SQ += " AND round_number = " + roundNumber;
		}
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			con = DB_Connection.getConnection();
			
			stmt = con.prepareStatement(SQ, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery();
			
			if (!rs.isBeforeFirst()) {  // check if any data exists
				games = null;
				return games;
			}
			
			games = getGamesFromResultSet(rs);
			
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
			
		}
		catch(Exception e) {
			System.err.print(e);
		}
		
		return games;
	}
	
	/** Deletes a game from database according date, gameNumber and roundNumber.
	 * @param userID Integer
	 * @param orderNumber Integer
	 * @return Boolean. True if succeeded.
	 */
	public static boolean deleteGameData(int year, int month, int day, int gameNumber, int roundNumber) {
		
		boolean res = false;
		String tbName = GameDataHandler.getTableName();
		String sd = String.format("%04d-%02d-%02d", year, month, day);
		String SQ = "DELETE FROM " + tbName + " WHERE date = ? AND game_number = ? AND round_number= ?";
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			con = DB_Connection.getConnection();
			stmt = con.prepareStatement(SQ, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			stmt.setString(1, sd);
			stmt.setInt(2, gameNumber);
			stmt.setInt(3, roundNumber);
			
			stmt.executeUpdate();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
		}
		catch(Exception e) {
			System.err.print(e);
			return res;
		}
		
		res = true;
		return res;
	}
	
	
//	public static void main(String[] args) {
//		
//		GameDataHandler.createGameDataTable();
//		
//		Game tg_1 = new Game(2020, 6, 20, 1, 1, false, 3, 2, false, 3, 40,
//				"aaa", "bbb", "ccc", "ddd", 25000, 25000, 25000, 25000, 0, -3000, 3000, 0,
//				false, false, false, false, false, true, false, false);
//		
//		Game tg_2 = new Game(2020, 6, 21, 1, 1, false, 1, 4, false, 4, 30,
//				"aaa", "bbb", "ccc", "ddd", 25000, 25000, 25000, 25000, 4000, 0, 0, -4000,
//				false, true, false, false, true, true, false, false);
//		
//		Game tg_3 = new Game(2020, 6, 21, 2, 1, false, 1, 4, false, 4, 30,
//				"aaa", "bbb", "ccc", "eee", 29000, 25000, 25000, 21000, 0, 0, 0, 0,
//				false, false, false, false, false, false, false, false);
//		
//		GameDataHandler.addGameData(tg_1);
//		GameDataHandler.addGameData(tg_2);
//		GameDataHandler.addGameData(tg_3);
//		GameDataHandler.deleteGameData(2020, 6, 20, 1, 1);
//		
//		
//		ArrayList<Game> ag = GameDataHandler.getResultFromDatabase("aaa", 2020, 6, 21, 2020, 6, 21, -1, 1);
//		if(ag == null) {
//			System.out.println("not found!!");
//		}else {
//			for(Game g: ag) {
//				System.out.print(g);
//			}
//		}
//		
//	}	
}