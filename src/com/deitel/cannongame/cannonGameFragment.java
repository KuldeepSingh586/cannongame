package com.deitel.cannongame;

import com.deitel.cannongame.R;

import android.app.Fragment;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class cannonGameFragment extends Fragment {
	
	private CannonView cannonView;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		super.onCreateView(inflater, container, savedInstanceState);
		View view=inflater.inflate(R.layout.fragment_game, container, false);
		cannonView=(CannonView) view.findViewById(R.id.cannonView);
		return view;
		
	}
		public void onActivityCreated(Bundle savedInstanceState) {
			
			super.onActivityCreated(savedInstanceState);
			getActivity().setVolumeControlStream(AudioManager.STREAM_MUSIC);
		}
		
		public void onPause() {
			super.onPause();
			cannonView.stopGame();
		}
		
		public void onDestroy() {
			super.onDestroy();
			cannonView.releaseResources();
		}
		
	

}
