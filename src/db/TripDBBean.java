/*
 * !!! 주의사항 !!!
 * 전부 void, 인자 없음으로 메소드 이름만 정의해둔 상태.
 * 메소드마다 리턴 값, 인자 알아서 채워 넣을 것.
 */

package db;

import org.apache.ibatis.session.SqlSession;

public class TripDBBean {
	SqlSession session;
	
	public TripDataBean getTrip() {
		TripDataBean tripDto=new TripDataBean();
		return tripDto;
	}
}
