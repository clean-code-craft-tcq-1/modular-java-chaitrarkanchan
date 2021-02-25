package colorcoder;

public class ColorService {
    public ColorPair getColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = (MajorColor)fromIndex(MajorColor.values(),zeroBasedPairNumber /ColorNames.numberOfMinorColors);
        MinorColor minorColor = (MinorColor)fromIndex(MinorColor.values(),zeroBasedPairNumber%ColorNames.numberOfMinorColors);
		return new ColorPair(majorColor, minorColor);
	}

	public  int getPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * ColorNames.numberOfMinorColors + minor.getIndex() + 1;
    }
	
	public  Color fromIndex(Object[] colors, int index) {
        for(Object obj: colors) {
        	Color color = (Color)obj;
            if(color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }
}
