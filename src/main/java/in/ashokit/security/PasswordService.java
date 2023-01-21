package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

//encode decode method 
public class PasswordService {

	// logic for encode to string
	public static String encode(String txt) {
		// bug fixing for Bug 101
		
		int a=12;
		int b=14;
		
		Encoder encoder = Base64.getEncoder(); // base 64 is predifine class in java this statement give encoder object
		return encoder.encodeToString(txt.getBytes()); // getBytes method user convert string value into byte value
	}

	public static String decode(String encodetxt) {
		String s = "Rajat";
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodetxt);
		return new String(decode); // convert byte array into string

	}

	public static void main(String[] args) {
		String encode = PasswordService.encode("Rajat");
		System.out.println(encode);

		String decode = PasswordService.decode(encode);
		System.out.println(decode);

	}

}
