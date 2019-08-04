/**
 * @author Francesco Baldi
 *
 * @mail francesco.baldi1987@gmail.com
 * @date 3-ago-2019
 */
package it.bld.generator.report.excel.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

// TODO: Auto-generated Javadoc
/**
 * The Interface ExcelMergeRow.
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface ExcelMergeRow {

	/**
	 * Reference field.
	 *
	 * @return the string
	 */
	public String referenceField();	
}
