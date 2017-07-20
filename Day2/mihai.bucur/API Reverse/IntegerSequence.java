
public class IntegerSequence implements ReverseAPI {

	@Override
	public Object reverse(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Long) {
			Long nr = (Long) obj;
			long k = 0;
			while (nr > 0) {
				k = k * 10 + nr % 10;
				nr = nr / 10;
			}
			return k;
		}
		return null;
	}

	@Override
	public Object reverseByMiddle(Object obj) {
		// TODO Auto-generated method stub

		String sequence = obj.toString();
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

}
