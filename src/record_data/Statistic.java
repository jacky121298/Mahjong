package record_data;

public class Statistic {

	private int numberOfGame; // 總共局數
	private int numberOfRound; // 總共場數
	private double firstRate; // 一位率
	private double secondRate; // 二位率
	private double thirdRate; // 三位率
	private double fourthRate; // 四位率
	private double averagePlace; // 平均順位
	private double richiRate; // 立直率
	private double chunkerRate; // 放槍率
	private double selfDrawRate; // 自摸率
	private double lonRate; // 榮和率
	private double averageHan; // 平均番數
	
	private int oneHan; // 一番
	private int twoHan; // 二番
	private int threeHan; // 三番
	private int fourHan; // 四番
	private int moreThanFiveHan; // 五番以上
	private int mangan; // 滿貫
	private int haneman; // 跳滿
	private int baiman; // 倍滿
	private int sanbaiman; // 三倍滿
	private int yakuman; // 役滿
	
	public String toString(){
		return "局數：" + this.numberOfGame + "\n場數：" + this.numberOfRound + "\n一位率：" + this.firstRate + "%\n二位率："
				  + this.secondRate + "%\n三位率：" + this.thirdRate + "%\n四位率：" + this.fourthRate + "%\n平均順位："
				  + this.averagePlace + "\n立直率：" + this.richiRate + "\n放槍率：" + this.chunkerRate + "\n自摸率："
				  + this.selfDrawRate + "\n榮和率：" + this.lonRate + "\n平均番數：" + this.averageHan;
	}
	
	public Statistic() {
		this.numberOfGame = 0;
		this.numberOfRound = 0;
		this.firstRate = 0.0;
		this.secondRate = 0.0;
		this.thirdRate = 0.0;
		this.fourthRate = 0.0;
		this.averagePlace = 0.0;
		this.richiRate = 0.0;
		this.chunkerRate = 0.0;
		this.selfDrawRate = 0.0;
		this.lonRate = 0.0;
		this.averageHan = 0.0;
		this.oneHan = 0;
		this.twoHan = 0;
		this.threeHan = 0;
		this.fourHan = 0;
		this.moreThanFiveHan = 0;
		this.mangan = 0;
		this.haneman = 0;
		this.baiman = 0;
		this.sanbaiman = 0;
		this.yakuman = 0;
	}
	
	/**
	 * @return the numberOfGame
	 */
	public int getNumberOfGame() {
		return numberOfGame;
	}
	
	/**
	 * @param numberOfGame the numberOfGame to set
	 */
	public void setNumberOfGame(int numberOfGame) {
		this.numberOfGame = numberOfGame;
	}
	
	/**
	 * @return the numberOfRound
	 */
	public int getNumberOfRound() {
		return numberOfRound;
	}

	/**
	 * @param numberOfRound the numberOfRound to set
	 */
	public void setNumberOfRound(int numberOfRound) {
		this.numberOfRound = numberOfRound;
	}
	
	/**
	 * @return the firstRate
	 */
	public double getFirstRate() {
		return firstRate;
	}

	/**
	 * @param firstRate the firstRate to set
	 */
	public void setFirstRate(double firstRate) {
		this.firstRate = firstRate;
	}

	/**
	 * @return the secondRate
	 */
	public double getSecondRate() {
		return secondRate;
	}

	/**
	 * @param secondRate the secondRate to set
	 */
	public void setSecondRate(double secondRate) {
		this.secondRate = secondRate;
	}

	/**
	 * @return the thirdRate
	 */
	public double getThirdRate() {
		return thirdRate;
	}

	/**
	 * @param thirdRate the thirdRate to set
	 */
	public void setThirdRate(double thirdRate) {
		this.thirdRate = thirdRate;
	}

	/**
	 * @return the dourthRate
	 */
	public double getFourthRate() {
		return fourthRate;
	}

	/**
	 * @param dourthRate the dourthRate to set
	 */
	public void setFourthRate(double fourthRate) {
		this.fourthRate = fourthRate;
	}

	/**
	 * @return the averagePlace
	 */
	public double getAveragePlace() {
		return averagePlace;
	}

	/**
	 * @param averagePlace the averagePlace to set
	 */
	public void setAveragePlace(double averagePlace) {
		this.averagePlace = averagePlace;
	}

	/**
	 * @return the richiRate
	 */
	public double getRichiRate() {
		return richiRate;
	}

	/**
	 * @param richiRate the richiRate to set
	 */
	public void setRichiRate(double richiRate) {
		this.richiRate = richiRate;
	}

	/**
	 * @return the chunkerRate
	 */
	public double getChunkerRate() {
		return chunkerRate;
	}

	/**
	 * @param chunkerRate the chunkerRate to set
	 */
	public void setChunkerRate(double chunkerRate) {
		this.chunkerRate = chunkerRate;
	}

	/**
	 * @return the selfDrawRate
	 */
	public double getSelfDrawRate() {
		return selfDrawRate;
	}

	/**
	 * @param selfDrawRate the selfDrawRate to set
	 */
	public void setSelfDrawRate(double selfDrawRate) {
		this.selfDrawRate = selfDrawRate;
	}

	/**
	 * @return the lonRate
	 */
	public double getLonRate() {
		return lonRate;
	}

	/**
	 * @param lonRate the lonRate to set
	 */
	public void setLonRate(double lonRate) {
		this.lonRate = lonRate;
	}

	/**
	 * @return the averageHan
	 */
	public double getAverageHan() {
		return averageHan;
	}

	/**
	 * @param averageHan the averageHan to set
	 */
	public void setAverageHan(double averageHan) {
		this.averageHan = averageHan;
	}

	/**
	 * @return the oneHan
	 */
	public int getOneHan() {
		return oneHan;
	}

	/**
	 * @param oneHan the oneHan to set
	 */
	public void setOneHan(int oneHan) {
		this.oneHan = oneHan;
	}

	/**
	 * @return the twoHan
	 */
	public int getTwoHan() {
		return twoHan;
	}

	/**
	 * @param twoHan the twoHan to set
	 */
	public void setTwoHan(int twoHan) {
		this.twoHan = twoHan;
	}

	/**
	 * @return the threeHan
	 */
	public int getThreeHan() {
		return threeHan;
	}

	/**
	 * @param threeHan the threeHan to set
	 */
	public void setThreeHan(int threeHan) {
		this.threeHan = threeHan;
	}

	/**
	 * @return the fourHan
	 */
	public int getFourHan() {
		return fourHan;
	}

	/**
	 * @param fourHan the fourHan to set
	 */
	public void setFourHan(int fourHan) {
		this.fourHan = fourHan;
	}

	/**
	 * @return the moreThanFiveHan
	 */
	public int getMoreThanFiveHan() {
		return moreThanFiveHan;
	}

	/**
	 * @param moreThanFiveHan the moreThanFiveHan to set
	 */
	public void setMoreThanFiveHan(int moreThanFiveHan) {
		this.moreThanFiveHan = moreThanFiveHan;
	}

	/**
	 * @return the mangan
	 */
	public int getMangan() {
		return mangan;
	}

	/**
	 * @param mangan the mangan to set
	 */
	public void setMangan(int mangan) {
		this.mangan = mangan;
	}

	/**
	 * @return the haneman
	 */
	public int getHaneman() {
		return haneman;
	}

	/**
	 * @param haneman the haneman to set
	 */
	public void setHaneman(int haneman) {
		this.haneman = haneman;
	}

	/**
	 * @return the baiman
	 */
	public int getBaiman() {
		return baiman;
	}

	/**
	 * @param baiman the baiman to set
	 */
	public void setBaiman(int baiman) {
		this.baiman = baiman;
	}

	/**
	 * @return the sanbaiman
	 */
	public int getSanbaiman() {
		return sanbaiman;
	}

	/**
	 * @param sanbaiman the sanbaiman to set
	 */
	public void setSanbaiman(int sanbaiman) {
		this.sanbaiman = sanbaiman;
	}

	/**
	 * @return the yakuman
	 */
	public int getYakuman() {
		return yakuman;
	}

	/**
	 * @param yakuman the yakuman to set
	 */
	public void setYakuman(int yakuman) {
		this.yakuman = yakuman;
	}
}