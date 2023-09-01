public class Test {

    public static void main(String[] args) {
        final FakeStack underTest = new FakeStack();

        underTest.push(1);
        underTest.push(2);
        underTest.push(3);
        underTest.push(4);
        underTest.push(5);
        underTest.push(6);
        underTest.push(7);
        underTest.push(8);
        underTest.push(9);
        underTest.push(11);

        assert(underTest.pop() == 10);
        assert(underTest.pop() == 9);
        assert(underTest.pop() == 8);
        assert(underTest.pop() == 7);
        assert(underTest.pop() == 6);
        assert(underTest.pop() == 5);
        assert(underTest.pop() == 4);
        assert(underTest.pop() == 3);
        assert(underTest.pop() == 2);
        assert(underTest.pop() == 1);

        System.out.println("success!");

    }
}
