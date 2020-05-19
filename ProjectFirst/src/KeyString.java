import java.io.IOException;

public class KeyString {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("입력 : ");
		int readByteNO = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNO-2);
		System.out.println(str);
	}

}
