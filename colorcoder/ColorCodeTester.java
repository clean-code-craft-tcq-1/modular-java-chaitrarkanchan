package colorcoder;

public class ColorCodeTester {

	public static void main(String[] args) {

        ReferenceManual refManual = new ReferenceManual();
        System.out.println(refManual.toString());
        
		ColorNames.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		ColorNames.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

		ColorNames.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		ColorNames.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
		
	}
}
