package uk.me.jstott.jcoord.ellipsoid;

/**
 * <p>
 * This class is part of the Jcoord package. Visit the <a
 * href="http://www.jstott.me.uk/jcoord/">Jcoord</a> website for more
 * information.
 * </p>
 * 
 * <p>
 * Class defining the Modified Everest reference ellipsoid.
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
public class ModifiedEverestEllipsoid extends Ellipsoid {
  
  /**
   * Static reference of this ellipsoid.
   */
  private static ModifiedEverestEllipsoid ref = null;

  /**
   * Create an object defining the Modified Everest reference ellipsoid.
   * 
   * @since 1.1
   */
  public ModifiedEverestEllipsoid() {
    super(6377304.063, 6356103.039);
  }
  
  
  /**
   * Get the static instance of this ellipsoid
   * 
   * @return a reference to the static instance of this ellipsoid
   * @since 1.1
   */
  public static ModifiedEverestEllipsoid getInstance() {
    if (ref == null) {
      ref = new ModifiedEverestEllipsoid();
    }
    return ref;
  }
}