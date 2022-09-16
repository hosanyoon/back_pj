package dao;

import java.util.ArrayList;
import java.util.List;

import dto.Video;

public class MainDaoImpl implements MainDao {
	private List<Video> list;
	private static MainDaoImpl instance;
	private MainDaoImpl() {
		list = new ArrayList<Video>();
		
	}
	
	public static MainDao getInstance() {
		if(instance == null ) {
			instance = new MainDaoImpl();
		}
		return instance;
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
