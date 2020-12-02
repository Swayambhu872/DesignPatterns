// Decorator class
public class BlackAndWhiteFilter implements Image{
    private Image newImage;
    public BlackAndWhiteFilter(Image newImage) {
        this.newImage = newImage;
    }

    @Override
    public void getDescription() {
        System.out.println("black and white filter applied");
    }
}
