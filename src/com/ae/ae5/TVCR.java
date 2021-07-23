package com.ae.ae5;

public class TVCR extends Tv{

	VCR vcr = new VCR(); //VCR 클래스를 상속받을 수 없기에 포함시켜서 사용함
	
	void play() {
		vcr.play();
	}
	void stop() {
		vcr.stop();
	}
	void rew(){
		vcr.stop();
	}
	void ff() {
		vcr.ff();
	}
	
	//다중 상속을 허용하지 않기 때문에 TVCR 클래스를 만들어 Tv를 상속받고 VCR은 객체를 선언해 사용한다
	
}


