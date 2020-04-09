public class DataStorage {
    private Book[] array = new Book[10];
    private int size = 0;

    public void addBooks(Book ob) {
        if (size == array.length) {
            extend();
        }
        array[size++] = ob;
    }

    private void extend() {
        Book temp[] = new Book[array.length + 10];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    public Book getBookByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (array[i].getTitle().equals(title)) {
                return array[i];
            }
        }
        return null;
    }

    public Book get(int index) {
        return array[index];
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

}
