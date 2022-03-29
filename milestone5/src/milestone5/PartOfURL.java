package milestone5;

import java.net.MalformedURLException;
import java.net.URL;

public class PartOfURL {

	static String GetProtocol(String s) {
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ':')
				return r;
			r += s.charAt(i);
		}
		return r;
	}

	static String GetFile(String s) {
		int i;
		for (i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '/')
				break;
		}
		String r = "";
		for (int j = i; j < s.length(); j++) {
			r += s.charAt(j);
		}
		return r;
	}

	static String GetPort(String s) {
		String r = "";
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (cnt >= 2) {
				if (s.charAt(i) == '/')
					break;
				r += s.charAt(i);
			}
			if (s.charAt(i) == ':')
				cnt++;
		}
		if (r.isEmpty()) {
			r += '-';
			r += '1';
		}
		return r;
	}

	static String GetPath(String s) {
		String r = "";
		int cnt = 0, i;
		for (i = 0; i < s.length(); i++) {
			if (cnt == 3)
				break;
			if (s.charAt(i) == '/')
				cnt++;
		}
		for (int j = i - 1; j < s.length(); j++) {
			r += s.charAt(j);
		}
		return r;
	}

	static String GetHost(String s) {
		String r = "";
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (cnt < 3 && cnt >= 2) {
				if (s.charAt(i) == '/')
					break;
				r += s.charAt(i);
			}
			if (s.charAt(i) == '/')
				cnt++;
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url = null;
		try {
			url = new URL("http://www.google.com/device");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("URL is " + url);

		System.out.println("\nPart of URL using own functions\n");
		System.out.println("protocol is : " + GetProtocol(url.toString()));
		System.out.println("File name is : " + GetFile(url.toString()));
		System.out.println("Host name is : " + GetHost(url.toString()));
		System.out.println("Path is : " + GetPath(url.toString()));
		System.out.println("port is : " + GetPort(url.toString()));

		System.out.println("\nPart of URL using inbuilt functions\n");

		System.out.println("protocol is " + url.getProtocol());
		System.out.println("file name is " + url.getFile());
		System.out.println("host is " + url.getHost());
		System.out.println("path is " + url.getPath());
		System.out.println("port is " + url.getPort());
		System.out.println("default port is " + url.getDefaultPort());
	}
}