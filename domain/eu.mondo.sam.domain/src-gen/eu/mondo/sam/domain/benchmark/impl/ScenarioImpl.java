/**
 */
package eu.mondo.sam.domain.benchmark.impl;

import eu.mondo.sam.domain.benchmark.BenchmarkPackage;
import eu.mondo.sam.domain.benchmark.Phase;
import eu.mondo.sam.domain.benchmark.Scenario;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.sam.domain.benchmark.impl.ScenarioImpl#getScenarioname <em>Scenarioname</em>}</li>
 *   <li>{@link eu.mondo.sam.domain.benchmark.impl.ScenarioImpl#getRootPhase <em>Root Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends ElementImpl implements Scenario
{
  /**
   * The default value of the '{@link #getScenarioname() <em>Scenarioname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarioname()
   * @generated
   * @ordered
   */
  protected static final String SCENARIONAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScenarioname() <em>Scenarioname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarioname()
   * @generated
   * @ordered
   */
  protected String scenarioname = SCENARIONAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRootPhase() <em>Root Phase</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootPhase()
   * @generated
   * @ordered
   */
  protected Phase rootPhase;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BenchmarkPackage.Literals.SCENARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScenarioname()
  {
    return scenarioname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScenarioname(String newScenarioname)
  {
    String oldScenarioname = scenarioname;
    scenarioname = newScenarioname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.SCENARIO__SCENARIONAME, oldScenarioname, scenarioname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Phase getRootPhase()
  {
    return rootPhase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRootPhase(Phase newRootPhase, NotificationChain msgs)
  {
    Phase oldRootPhase = rootPhase;
    rootPhase = newRootPhase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BenchmarkPackage.SCENARIO__ROOT_PHASE, oldRootPhase, newRootPhase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRootPhase(Phase newRootPhase)
  {
    if (newRootPhase != rootPhase)
    {
      NotificationChain msgs = null;
      if (rootPhase != null)
        msgs = ((InternalEObject)rootPhase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BenchmarkPackage.SCENARIO__ROOT_PHASE, null, msgs);
      if (newRootPhase != null)
        msgs = ((InternalEObject)newRootPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BenchmarkPackage.SCENARIO__ROOT_PHASE, null, msgs);
      msgs = basicSetRootPhase(newRootPhase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.SCENARIO__ROOT_PHASE, newRootPhase, newRootPhase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BenchmarkPackage.SCENARIO__ROOT_PHASE:
        return basicSetRootPhase(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BenchmarkPackage.SCENARIO__SCENARIONAME:
        return getScenarioname();
      case BenchmarkPackage.SCENARIO__ROOT_PHASE:
        return getRootPhase();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BenchmarkPackage.SCENARIO__SCENARIONAME:
        setScenarioname((String)newValue);
        return;
      case BenchmarkPackage.SCENARIO__ROOT_PHASE:
        setRootPhase((Phase)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BenchmarkPackage.SCENARIO__SCENARIONAME:
        setScenarioname(SCENARIONAME_EDEFAULT);
        return;
      case BenchmarkPackage.SCENARIO__ROOT_PHASE:
        setRootPhase((Phase)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BenchmarkPackage.SCENARIO__SCENARIONAME:
        return SCENARIONAME_EDEFAULT == null ? scenarioname != null : !SCENARIONAME_EDEFAULT.equals(scenarioname);
      case BenchmarkPackage.SCENARIO__ROOT_PHASE:
        return rootPhase != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (scenarioname: ");
    result.append(scenarioname);
    result.append(')');
    return result.toString();
  }

} //ScenarioImpl
