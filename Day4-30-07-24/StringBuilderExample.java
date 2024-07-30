public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("Java");
        System.out.println(sb);
        sb.insert(5, ", ");
        System.out.println(sb);
        sb.replace(5, 7,"_");
        System.out.println(sb);
        sb.delete(6, 11);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        sb.append("java_is_my_favourite_language");
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }
}



