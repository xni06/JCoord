package uk.me.jstott.jcoord.ellipsoid;

/**
 * <p>
 * This class is part of the Jcoord package. Visit the <a
 * href="http://www.jstott.me.uk/jcoord/">Jcoord</a> website for more
 * information.
 * </p>
 * 
 * <p>
 * Class defining the Helmert 1906 reference ellipsoid.
 * </p>
 * 
 * <p>
 * (c) 2006 Jonathan Stott
 * </p>
 * 
 * <p>
 * Created on 02-Apr-2006
 * </p>
 * 
 * @author Jonathan Stott
 * @version 1.1
 * @since 1.1
 */
public class Helmert1906Ellipsoid extends Ellipsoid {
  
  /**
   * Static reference of this ellipsoid.
   */
  private static Helmert1906Ellipsoid ref = null;
  

  /**
   * Create an object defining the Helmert 1906 reference ellipsoid.
   * 
   * @since 1.1
   */
  private Helmert1906Ellipsoid() {
    super(6378200.0, 6356818.17);
  }
  
  
  /**
   * Get the static instance of this ellipsoid
   * 
   * @return a reference to the static instance of this ellipsoid
   * @since 1.1
   */
  public static Helmert1906Ellipsoid getInstance() {
    if (ref == null) {
      ref = new Helmert1906Ellipsoid();
    }
    return ref;
  }
}