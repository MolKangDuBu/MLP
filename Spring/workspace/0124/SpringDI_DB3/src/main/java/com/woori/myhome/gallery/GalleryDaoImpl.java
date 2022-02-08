package com.woori.myhome.gallery;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("galleryDao")
public class GalleryDaoImpl implements GalleryDao{

	@Autowired 
	SqlSessionTemplate sm;
	
	
	@Override
	public List<GalleryDto> getList(GalleryDto dto) {
		// TODO Auto-generated method stub
		return sm.selectList("Gallery_getList", dto);
	}

	@Override
	public int getTotal(GalleryDto dto) {
		// TODO Auto-generated method stub
		return sm.selectOne("Gallery_getTotal", dto);
	}

	@Override
	public void insert(GalleryDto dto) {
		// TODO Auto-generated method stub
		sm.insert("Gallery_insert", dto);
	}

	@Override
	public void update(GalleryDto dto) {
		// TODO Auto-generated method stub
		sm.update("Gallery_update", dto);
	}

	@Override
	public void delete(GalleryDto dto) {
		// TODO Auto-generated method stub
		sm.delete("Gallery_delete", dto);
	}

	@Override
	public GalleryDto getView(GalleryDto dto) {
		// TODO Auto-generated method stub
		return sm.selectOne("Gallery_getView", dto);
	}

}
