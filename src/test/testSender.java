package test;

import java.io.IOException;


import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Sender;

public class testSender {
	
	public static void main(String[] args) throws IOException {
		
		Sender sender = new Sender("AIzaSyA0EGE_tRowpirxKhKuS2trQ8QR-RzqzIc");
		Message mensaje = new Message.Builder().addData("mensaje1k", "mensaje valor 2").build();
		String regId = "APA91bHoBE3U-N-TGpbUYaSqyHVcVQIfawB3ktjIW8qDmaEo1s-vq33eA6b3Hx71nWQP5i9qRSoMY8wFYQShI7ELz3hR6P14y195i8sXWmYZ08FocX_MJUSbjVdvUgSbZd21e7iCyn7j2DRyDnK9WmaR0kUApWHOv7eFmQ8NdIhriVMLqWFu84I";
		com.google.android.gcm.server.Result r = sender.send(mensaje, regId, 2);
		System.out.println("RESULTADO::"+r);
	}

}
