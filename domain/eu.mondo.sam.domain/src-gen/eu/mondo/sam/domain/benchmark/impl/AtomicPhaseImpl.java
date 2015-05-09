/**
 */
package eu.mondo.sam.domain.benchmark.impl;

import eu.mondo.sam.domain.benchmark.AtomicPhase;
import eu.mondo.sam.domain.benchmark.AttachedMetric;
import eu.mondo.sam.domain.benchmark.BenchmarkPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.sam.domain.benchmark.impl.AtomicPhaseImpl#getAtomicname <em>Atomicname</em>}</li>
 *   <li>{@link eu.mondo.sam.domain.benchmark.impl.AtomicPhaseImpl#getMetrics <em>Metrics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicPhaseImpl extends PhaseImpl implements AtomicPhase
{
  /**
   * The default value of the '{@link #getAtomicname() <em>Atomicname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomicname()
   * @generated
   * @ordered
   */
  protected static final String ATOMICNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAtomicname() <em>Atomicname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomicname()
   * @generated
   * @ordered
   */
  protected String atomicname = ATOMICNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetrics()
   * @generated
   * @ordered
   */
  protected EList<AttachedMetric> metrics;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicPhaseImpl()
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
    return BenchmarkPackage.Literals.ATOMIC_PHASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAtomicname()
  {
    return atomicname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtomicname(String newAtomicname)
  {
    String oldAtomicname = atomicname;
    atomicname = newAtomicname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.ATOMIC_PHASE__ATOMICNAME, oldAtomicname, atomicname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttachedMetric> getMetrics()
  {
    if (metrics == null)
    {
      metrics = new EObjectContainmentEList<AttachedMetric>(AttachedMetric.class, this, BenchmarkPackage.ATOMIC_PHASE__METRICS);
    }
    return metrics;
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
      case BenchmarkPackage.ATOMIC_PHASE__METRICS:
        return ((InternalEList<?>)getMetrics()).basicRemove(otherEnd, msgs);
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
      case BenchmarkPackage.ATOMIC_PHASE__ATOMICNAME:
        return getAtomicname();
      case BenchmarkPackage.ATOMIC_PHASE__METRICS:
        return getMetrics();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BenchmarkPackage.ATOMIC_PHASE__ATOMICNAME:
        setAtomicname((String)newValue);
        return;
      case BenchmarkPackage.ATOMIC_PHASE__METRICS:
        getMetrics().clear();
        getMetrics().addAll((Collection<? extends AttachedMetric>)newValue);
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
      case BenchmarkPackage.ATOMIC_PHASE__ATOMICNAME:
        setAtomicname(ATOMICNAME_EDEFAULT);
        return;
      case BenchmarkPackage.ATOMIC_PHASE__METRICS:
        getMetrics().clear();
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
      case BenchmarkPackage.ATOMIC_PHASE__ATOMICNAME:
        return ATOMICNAME_EDEFAULT == null ? atomicname != null : !ATOMICNAME_EDEFAULT.equals(atomicname);
      case BenchmarkPackage.ATOMIC_PHASE__METRICS:
        return metrics != null && !metrics.isEmpty();
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
    result.append(" (atomicname: ");
    result.append(atomicname);
    result.append(')');
    return result.toString();
  }

} //AtomicPhaseImpl
