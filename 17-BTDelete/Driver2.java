public class Driver2 {
    public static void main(String[] args) {
        BST test = new BST();
        test.insert(10);
        test.insert(100);
        test.insert(50);
        test.insert(110);
        System.out.println(test.search(10));
        System.out.println(test.search(100));
        System.out.println(test.piggySearch(100));
        System.out.println(test.search(75));
        System.out.println(test.search2(test.root,10));
        System.out.println(test.search2(test.root,100));
        System.out.println(test.search2(test.root,75));
        test.delete(100);
        System.out.println(test.search(10));
        System.out.println(test.search(100));
        System.out.println(test.piggySearch(10));
        System.out.println(test.piggySearch(100));
    }
}