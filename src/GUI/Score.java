package GUI;

public class Score {
	/**
	 * 胡牌時使用
	 * @param isEast 代表胡牌者是不是莊家
	 * @param han 是翻數, 滿貫以上時是字串
	 * @param fuku 是符數
	 * @param homba 本場數
	 * @return 放槍者要被扣的點數
	 */
	public static int RonCalculateScore(boolean isEast, String han, int fuku, int homba) {
		if(han.equals("役滿")) {
			if(isEast) return 48000 + homba*300;
			else return 32000 + homba*300;
		}
		else if(han.equals("三倍滿")) {
			if(isEast) return 36000 + homba*300;
			else return 24000 + homba*300;
		}
		else if(han.equals("倍滿")) {
			if(isEast) return 24000 + homba*300;
			else return 16000 + homba*300;
		}
		else if(han.equals("跳滿")) {
			if(isEast) return 18000 + homba*300;
			else return 12000 + homba*300;
		}
		else if(han.equals("滿貫")) {
			if(isEast) return 12000 + homba*300;
			else return 8000 + homba*300;
		}
		else { //滿貫以下
			int hanNumber = Integer.parseInt(han.substring(0, han.indexOf("翻")));
			if(isEast) return RoundUp(((int)Math.pow(2, 2+hanNumber)) * fuku * 6) + homba*300;
			else return RoundUp(((int)Math.pow(2, 2+hanNumber)) * fuku * 4) + homba*300;
		}
	}
	
	/**
	 * 自摸時使用
	 * @param isEast 代表胡牌者是不是莊家
	 * @param han 是翻數, 滿貫以上時是字串
	 * @param fuku 是符數
	 * @param homba 本場數
	 * @param victimIsEast 代表被自摸的人是不是莊家，顯然的，若莊家自摸則其他三家都不是莊家
	 * @return 被自摸者要被扣的點數
	 */
	public static int TsumoCalculateScore(boolean isEast, String han, int fuku, int homba, boolean victimIsEast) {
		if(han.equals("役滿")) {
			if(isEast || victimIsEast) return 16000 + homba*100;
			else return 8000 + homba*100;
		}
		else if(han.equals("三倍滿")) {
			if(isEast || victimIsEast) return 12000 + homba*100;
			else return 6000 + homba*100;
		}
		else if(han.equals("倍滿")) {
			if(isEast || victimIsEast) return 8000 + homba*100;
			else return 4000 + homba*100;
		}
		else if(han.equals("跳滿")) {
			if(isEast || victimIsEast) return 6000 + homba*100;
			else return 3000 + homba*100;
		}
		else if(han.equals("滿貫")) {
			if(isEast || victimIsEast) return 4000 + homba*100;
			else return 2000 + homba*100;
		}
		else { //滿貫以下
			int hanNumber = Integer.parseInt(han.substring(0, han.indexOf("翻")));
			if(isEast || victimIsEast) return RoundUp(((int)Math.pow(2, 2+hanNumber)) * fuku * 2) + homba*100;
			else return RoundUp(((int)Math.pow(2, 2+hanNumber)) * fuku * 1) + homba*100;
		}
	}
	private static int RoundUp(int raw) {
		int tmp = raw % 100;
		if (tmp != 0) {
			return raw - tmp + 100;
		}
		else {
			return raw;
		}
	}
}