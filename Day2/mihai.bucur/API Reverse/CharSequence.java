
public class CharSequence implements ReverseAPI {

	@Override
	public Object reverse(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof String) {
			String reversedString = "";
			for (int i = ((String) obj).length() - 1; i >= 0; i--) {
				reversedString += ((String) obj).charAt(i);
			}
			return reversedString;
		}
		return null;
	}

	@Override
	public Object reverseByMiddle(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof String) {
			String sequence = (String) obj;
			int middle = sequence.length() / 2;

			String newSequence = "";
			for (int i = middle - 1; i >= 0; i--) {
				newSequence += sequence.charAt(i);
			}
			newSequence += sequence.charAt(middle);

			for (int i = sequence.length() - 1; i > middle; i--) {
				newSequence += sequence.charAt(i);
			}
			return newSequence;
		}
		return null;
	}

}
