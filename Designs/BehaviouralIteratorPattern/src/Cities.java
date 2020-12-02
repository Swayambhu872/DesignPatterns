public class Cities implements  Group {
    public String [] cityNames ={"Paris", "Rome", "Dublin"};
    @Override
    public Iterator getIterator() {

        return new cityIterator();
    }
    private class cityIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if(index < cityNames.length) {
                return true;
            } else
                return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return cityNames [index++];
            }
            return null;
        }
    }
}
