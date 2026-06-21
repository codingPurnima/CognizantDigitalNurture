public class BookSearch {

    public static Book linear(Book[] books, String title) {
        for (Book b : books) {
            if (b.title.equals(title)) return b;
        }
        return null;
    }

    public static Book binary(Book[] books, String title) {

        int l = 0, r = books.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            int cmp = books[mid].title.compareTo(title);

            if (cmp == 0) return books[mid];
            else if (cmp < 0) l = mid + 1;
            else r = mid - 1;
        }
        return null;
    }
}