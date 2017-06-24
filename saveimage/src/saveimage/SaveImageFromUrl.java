/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveimage;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) throws Exception {
		String imageUrl = "https://thumbs.mic.com/MDFhMmE4NDk0OCMvMzRSUWFOTUVDX0E5ejIxRkpONW1oZWVjbllrPS8weDA6MTIxMHg2MjAvMTYwMHg5MDAvZmlsdGVyczpmb3JtYXQoanBlZyk6cXVhbGl0eSg4MCkvaHR0cHM6Ly9zMy5hbWF6b25hd3MuY29tL3BvbGljeW1pYy1pbWFnZXMvOXZld3h0dnZ2empyc21pcG5hMXFyem51b2Y3ZzZna2x2ZDVtanZtdnlkeHZ6Mjh4Ym9vZWcxeXpwZ20xOGFpOC5qcGc.jpg";
		String destinationFile = "C:\\Users\\stephanie\\Downloads\\rihanna.jpg";

		saveImage(imageUrl, destinationFile);
	}

	public static void saveImage(String imageUrl, String destinationFile) throws IOException {
		URL url = new URL(imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);

		byte[] b = new byte[2048];
		int length;

		while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
		}

		is.close();
		os.close();
	}

}
