/**
 * Shorthands / Method references
 * 1. Purpose syntax & usage: A method reference is described using :: (double colon) syntax. For example, System.out::println refers to the println method of the System.out object.
 * 2. Functional interfaces: They are used with functional interfaces.
 * 3. Benefit: They make your code more readable and concise.
 * 4. Limitation: They can only be used for methods that fit the parameters and return type.
 *
 * Sytax:
 * - Static Method References:
 *     -- ClassName::StaticMethodName
 * - Instance Method:
 *     -- instance::instanceMethodName
 * - Instance Method Particular Class:
 *     -- ClassName::methodName
 * - Constructor References:
 *     -- ClassName::new
 *
 * Lambda Expression = Method Reference
 * 1. s -> s.toLowerCase() = String::toLowerCase
 * 2. s.toLowerCase() = String::toLowerCase
 * 3. (a, b) -> a.compareTo(b) = For integers it will be Integer::compareTo and for Strings it will be String::compareTo
 * 4. (a, b) -> Person.compareByAge(a, b) = Person::compareByAge
 *
 */

package com.coding.FunctionalInterfaces;

public class MethodReferences {
}
