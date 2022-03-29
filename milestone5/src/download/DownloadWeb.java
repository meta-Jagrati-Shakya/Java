package download;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url=null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		String line;

		try {
			url = new URL("http://www.google.com");
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			writer = new BufferedWriter(new FileWriter("data.html"));
			while ((line = reader.readLine()) != null) {
				System.out.println(line+"\n");
				writer.write(line);
				writer.newLine();
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				reader.close();
			} catch (Exception e) {
			}
			try {
				writer.close();
			} catch (IOException e) {
			}
		}

	}

}
