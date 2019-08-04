package it.bld.generator.bld.report.junit.entity;

import javax.validation.constraints.Size;

import it.bld.generator.report.excel.SheetDynamicData;
import it.bld.generator.report.excel.annotation.ExcelHeaderLayout;
import it.bld.generator.report.excel.annotation.ExcelMarginSheet;
import it.bld.generator.report.excel.annotation.ExcelSheetLayout;

@ExcelSheetLayout(notMerge = false)
@ExcelHeaderLayout
@ExcelMarginSheet(bottom = 1.5,left = 1.5,right = 1.5,top = 1.5)
public class AutoreLibriSheetDynamic extends SheetDynamicData<AutoreLibriRowDynamic>{

	public AutoreLibriSheetDynamic(@Size(max = 30) String nameSheet) {
		super(nameSheet);
		
	}

	@Override
	public Class<AutoreLibriRowDynamic> getRowClass() {
		return AutoreLibriRowDynamic.class;
	}

	
	
}
