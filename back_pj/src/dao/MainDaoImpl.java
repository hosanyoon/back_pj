package dao;

import java.util.ArrayList;
import java.util.List;

import dto.Video;

public class MainDaoImpl implements MainDao {
	private List<Video> list;
	private static MainDaoImpl instance;
	private MainDaoImpl() {
		list = new ArrayList<Video>();
		list.add(new Video("전신 다이어트 최고의 운동 [칼소폭 찐 핵핵매운맛]","전신","gMaB-fG4u4g","ThankyouBUBU",11));
	    list.add(new Video("하루 15분! 전신 칼로리 불태우는 다이어트 운동","전신","swRNeYw1JkY","ThankyouBUBU",10));
	    list.add(new Video("상체 다이어트 최고의 운동 BEST [팔뚝살/겨드랑이살/등살/가슴어깨라인]","상체","54tTYO-vU2E","ThankyouBUBU",12));
		
	}
	
	public static MainDao getInstance() {
		if(instance == null ) {
			instance = new MainDaoImpl();
		}
		return instance;
	}
	
	public List<Video> getList() {
		return list;
	}

	
	@Override
	public List<Video> selectInterestViewFitVideo() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<Video> selectPartFitVideo() {
		// TODO Auto-generated method stub
		return null;
	}

}
