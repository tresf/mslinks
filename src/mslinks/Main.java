package mslinks;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {		
		ShellLink sl = ShellLink.createLink("pause.bat")
			.setWorkingDir("..");
		sl.getConsoleData()
			.setFont(mslinks.extra.ConsoleData.Font.Consolas)
			.setFontSize(24)
			.setTextColor(5);
				
		sl.saveTo("testlink.lnk");
		System.out.println(sl.getWorkingDir());
		System.out.println(sl.resolveTarget());
	}
}
