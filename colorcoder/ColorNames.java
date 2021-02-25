package colorcoder;

public class ColorNames {
	public final static String MajorColorNames[] = { "White", "Red", "Black", "Yellow", "Violet" };
	public final static int numberOfMajorColors = MajorColorNames.length;
	public final static String MinorColorNames[] = { "Blue", "Orange", "Green", "Brown", "Slate" };
	public final static int numberOfMinorColors = MinorColorNames.length;

	private static ColorService service = new ColorService();

	public static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
		ColorPair colorPair = service.getColorFromPairNumber(pairNumber);
		System.out.println("Got pair " + colorPair.ToString());
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	public static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
		int pairNumber = service.getPairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}
}
