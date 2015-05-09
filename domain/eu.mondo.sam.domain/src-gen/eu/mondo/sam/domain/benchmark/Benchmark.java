/**
 */
package eu.mondo.sam.domain.benchmark;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Benchmark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.sam.domain.benchmark.Benchmark#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getBenchmark()
 * @model
 * @generated
 */
public interface Benchmark extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link eu.mondo.sam.domain.benchmark.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getBenchmark_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // Benchmark