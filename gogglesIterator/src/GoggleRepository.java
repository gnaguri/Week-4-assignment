
public class GoggleRepository implements Container {

	String googles[] = { "chemical splash goggles", " impact goggles", "Face shields", "Full Cube", "Block Ice","Spheres" };

	@Override
	public Iterator getIterator() {

		return new CollectionofIceIterator();
	}

	private class CollectionofIceIterator implements Iterator {
		int i;

		@Override
		public boolean hasNext() {
			if (i < googles.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return googles[i++];
			}
			return null;
		}
	}

}
