package AbstractExercise;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        rightLink = item;
        return item;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        leftLink = item;
        return item;
    }

    @Override
    int compareTo(ListItem item) {
//        return Integer.compare((int) value, (int) item.value);
        if (item == null) {
            return -1;
        }
        return ((String) super.getValue()).compareTo((String) item.getValue());
    }
}
