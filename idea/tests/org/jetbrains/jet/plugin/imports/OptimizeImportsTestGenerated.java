/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.plugin.imports;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.plugin.imports.AbstractOptimizeImportsTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/editor/optimizeImports")
public class OptimizeImportsTestGenerated extends AbstractOptimizeImportsTest {
    public void testAllFilesPresentInOptimizeImports() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/editor/optimizeImports"), Pattern.compile("^([^\\.]+)$"), false);
    }
    
    @TestMetadata("AlreadyOptimized")
    public void testAlreadyOptimized() throws Exception {
        doTest("idea/testData/editor/optimizeImports/AlreadyOptimized");
    }
    
    @TestMetadata("ArrayAccessExpression")
    public void testArrayAccessExpression() throws Exception {
        doTest("idea/testData/editor/optimizeImports/ArrayAccessExpression");
    }
    
    @TestMetadata("ClassMemberImported")
    public void testClassMemberImported() throws Exception {
        doTest("idea/testData/editor/optimizeImports/ClassMemberImported");
    }
    
    @TestMetadata("ComponentFunction")
    public void testComponentFunction() throws Exception {
        doTest("idea/testData/editor/optimizeImports/ComponentFunction");
    }
    
    @TestMetadata("DefaultJsImports")
    public void testDefaultJsImports() throws Exception {
        doTest("idea/testData/editor/optimizeImports/DefaultJsImports");
    }
    
    @TestMetadata("DuplicatedImports")
    public void testDuplicatedImports() throws Exception {
        doTest("idea/testData/editor/optimizeImports/DuplicatedImports");
    }
    
    @TestMetadata("Enums")
    public void testEnums() throws Exception {
        doTest("idea/testData/editor/optimizeImports/Enums");
    }
    
    @TestMetadata("InvokeFunction")
    public void testInvokeFunction() throws Exception {
        doTest("idea/testData/editor/optimizeImports/InvokeFunction");
    }
    
    @TestMetadata("IteratorFunction")
    public void testIteratorFunction() throws Exception {
        doTest("idea/testData/editor/optimizeImports/IteratorFunction");
    }
    
    @TestMetadata("JavaStaticField")
    public void testJavaStaticField() throws Exception {
        doTest("idea/testData/editor/optimizeImports/JavaStaticField");
    }
    
    @TestMetadata("KotlinPackage")
    public void testKotlinPackage() throws Exception {
        doTest("idea/testData/editor/optimizeImports/KotlinPackage");
    }
    
    @TestMetadata("Kt1850FullQualified")
    public void testKt1850FullQualified() throws Exception {
        doTest("idea/testData/editor/optimizeImports/Kt1850FullQualified");
    }
    
    @TestMetadata("Kt1850InnerClass")
    public void testKt1850InnerClass() throws Exception {
        doTest("idea/testData/editor/optimizeImports/Kt1850InnerClass");
    }
    
    @TestMetadata("Kt2488EnumEntry")
    public void testKt2488EnumEntry() throws Exception {
        doTest("idea/testData/editor/optimizeImports/Kt2488EnumEntry");
    }
    
    @TestMetadata("Kt2709")
    public void testKt2709() throws Exception {
        doTest("idea/testData/editor/optimizeImports/Kt2709");
    }
    
    @TestMetadata("PartiallyQualified")
    public void testPartiallyQualified() throws Exception {
        doTest("idea/testData/editor/optimizeImports/PartiallyQualified");
    }
    
    @TestMetadata("RemoveImportsIfGeneral")
    public void testRemoveImportsIfGeneral() throws Exception {
        doTest("idea/testData/editor/optimizeImports/RemoveImportsIfGeneral");
    }
    
    @TestMetadata("RemoveImportsIfGeneralBefore")
    public void testRemoveImportsIfGeneralBefore() throws Exception {
        doTest("idea/testData/editor/optimizeImports/RemoveImportsIfGeneralBefore");
    }
    
    @TestMetadata("SamConstructor")
    public void testSamConstructor() throws Exception {
        doTest("idea/testData/editor/optimizeImports/SamConstructor");
    }
    
    @TestMetadata("UnusedImports")
    public void testUnusedImports() throws Exception {
        doTest("idea/testData/editor/optimizeImports/UnusedImports");
    }
    
    @TestMetadata("WithAliases")
    public void testWithAliases() throws Exception {
        doTest("idea/testData/editor/optimizeImports/WithAliases");
    }
    
}
