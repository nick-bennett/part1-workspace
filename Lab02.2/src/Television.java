import java.util.Set;

public class Television {

  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;
  public static final Set<String> VALID_BRANDS = Set.of("Samsung", "LG", "Sony", "Toshiba");

  private static final String INVALID_BRAND_FORMAT =
      "%s is not a valid brand; one of %s is required.%n";
  private static final String INVALID_VOLUME_FORMAT =
      "%d is invalid; volume must be between %d and %d (inclusive).%n";
  private static final String TO_STRING_FORMAT = "Television: brand=%s, volume=%d, display=%s";

  private static int instanceCount = 0;

  private String brand;
  private int volume;
  private DisplayType display = DisplayType.LED;

  public Television() {
    instanceCount++;
  }

  public Television(String brand) {
    this();
    setBrand(brand);
  }

  public Television(String brand, int volume) {
    this(brand);
    setVolume(volume);
  }

  public Television(String brand, int volume, DisplayType display) {
    this(brand, volume);
    setDisplay(display);
  }

  public void turnOn() {
    boolean isConnected = verifyInternetConnection();
    System.out.println("The " + brand + " television is on, with a volume of " + volume);
  }

  public void turnOff() {
    System.out.println("The " + brand + " television is off");
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    if (VALID_BRANDS.contains(brand)) {
      this.brand = brand;
    } else {
      System.out.printf(INVALID_BRAND_FORMAT, brand, VALID_BRANDS);
    }
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
      System.out.printf(INVALID_VOLUME_FORMAT, volume, MIN_VOLUME, MAX_VOLUME);
    } else {
      this.volume = volume;
    }
  }

  public DisplayType getDisplay() {
    return display;
  }

  public void setDisplay(DisplayType display) {
    this.display = display;
  }

  private boolean verifyInternetConnection() {
    return true;
  }

  @Override
  public String toString() {
    return String.format(TO_STRING_FORMAT, brand, volume, display);
  }

}
