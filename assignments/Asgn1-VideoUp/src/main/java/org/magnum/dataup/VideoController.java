package org.magnum.dataup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.magnum.dataup.model.Video;
import org.magnum.dataup.model.VideoStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import retrofit.client.Response;
import retrofit.mime.TypedFile;

@Controller
@RequestMapping("/video")
public class VideoController implements VideoSvcApi{
	
	private Collection<Video> videos;
	private VideoFileManager vfm;
	
	public VideoController(){
		this.videos = new ArrayList<Video>();
		try {
			this.vfm = VideoFileManager.get();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Video> getVideoList() {
		return this.videos;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST)
	public Video addVideo(Video v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value="video/{id}/data", method = RequestMethod.POST)
	public VideoStatus setVideoData(long id, TypedFile videoData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value="video/{id}/data", method = RequestMethod.GET)
	public Response getData(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
