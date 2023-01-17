package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

//encode decode method 
public class PasswordService {
	
	int i = 10;

	// logic for encode to string
	public static String encode(String txt) {
		Encoder encoder = Base64.getEncoder(); // base 64 is predifine class in java this statement give encoder object
		return encoder.encodeToString(txt.getBytes()); // getBytes method user convert string value into byte value
	}

	public static String decode(String encodetxt) {
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
