package AbstractExercise;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (root == null) {
            root = item;
            return true;
        }
        var currentNode = root;
        while (currentNode != null) {

            int comparison = (currentNode.compareTo(item));
            if (comparison < 0) {
                if (currentNode.next() == null) {
                    currentNode.setNext(item).setPrevious(currentNode);
                    return true;
                }
                currentNode = currentNode.next();
            } else if (comparison > 0) {
                if (currentNode.previous() == null) {
                    item.setNext(root).setPrevious(item);
                    this.root = item;
                } else {
                    currentNode.previous().setNext(item.setPrevious(currentNode.previous()).setNext(currentNode).setPrevious(item));
                }
                return true;
            } else {
                System.out.println(item.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());

        }
        var currentNode = root;
        while (currentNode != null) {
            if (currentNode.compareTo(item) == 0) {
                if (currentNode == this.root) {
                    this.root = currentNode.next();
                } else {
                    currentNode.previous().setNext(currentNode.next());
                    if (currentNode.next() != null) {
                        currentNode.next().setPrevious(currentNode.previous());
                    }
                }
                return true;
            } else if (currentNode.compareTo(item) < 0) {
                currentNode = currentNode.next();
            } else { // comparison > 0
                return false;
            }
        }
        // Reached end of list with no remaining items
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        }
        while (root != null) {
            System.out.print(root.getValue() +  " ");
            root = root.next();
        }
        System.out.println();
    }
}
