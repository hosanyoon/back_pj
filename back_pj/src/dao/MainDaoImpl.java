package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
	    list.add(new Video("상체비만 다이어트 최고의 운동 [상체 핵매운맛]","상체","QqqZH3j_vH0","ThankyouBUBU",15));
	    list.add(new Video("하체운동이 중요한 이유? 이것만 보고 따라하자 ! [하체운동 교과서]","하체","tzN6ypk6Sps","김강민",14));
	    list.add(new Video("저는 하체 식주의자 입니다","하체","u5OgcZdNbMo","GYM종국",16));
	    list.add(new Video("11자복근 복부 최고의 운동 [복근 핵매운맛]","복부","PjGcOP-TQPE","ThankyouBUBU",20));
	    list.add(new Video("(Sub)누워서하는 5분 복부운동!! 효과보장! (매일 2주만 해보세요!)","복부","7TLk7pscICk","SomiFit",10));
		
	}
	
	public Video getVideo(String youtubeId) {
		for (Video video : list) {
			if(youtubeId.equals(video.getYoutubeId())) {
				return video;
			}
		}
		return null;
	}
	
	public static MainDao getInstance() {
		if(instance == null ) {
			instance = new MainDaoImpl();
		}
		return instance;
	}
	
	public List<Video> getList() {
		Collections.sort(list,(c1, c2) -> c2.getViewCnt()-c1.getViewCnt());
		return list;
	}

	
	@Override
	public List<Video> selectInterestViewFitVideo() {
		Collections.sort(list,(c1, c2) -> c2.getViewCnt()-c1.getViewCnt());
		return list;
	}

	
	@Override
	public List<Video> selectPartFitVideo(String part) {
		List<Video> partList = new ArrayList<Video>();
		
		for (Video video : list) {
			if(part.equals(video.getFitPartName())) {
				partList.add(video);
			}
		}
		
		return partList;
	}

}
