package week1.day3;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser edge = new Browser();
		String browsername = edge.launchBrowser("Safari");
		System.out.println(browsername);
		edge.loadUrl();
	}

}
