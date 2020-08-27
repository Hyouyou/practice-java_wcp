package chapter;

public class ThreadSample implements Runnable {
	int num;

    // コンストラクタ
    public ThreadSample(int num) {
        this.num = num;
    }

    // runメソッドを作成
    // Chapter15_4と同じようにループごとに1秒間スリープして表示
    public void run(){
    	try {
    		for(int i = 1 ; i <= 3 ; i++ ) {
        		Thread.sleep(1500);
        		System.out.println("ThreadSample"+ num + "のスレッド:" + i +"回目");
        	}
    	}catch(InterruptedException e) {
    		e.printStackTrace();
    	}
    }
}
