/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.resolve;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/resolve/resolveModeComparison")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ResolveModeComparisonTestGenerated extends AbstractResolveModeComparisonTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInResolveModeComparison() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/resolve/resolveModeComparison"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("Classes.kt")
    public void testClasses() throws Exception {
        runTest("idea/testData/resolve/resolveModeComparison/Classes.kt");
    }

    @TestMetadata("FileAnnotations.kt")
    public void testFileAnnotations() throws Exception {
        runTest("idea/testData/resolve/resolveModeComparison/FileAnnotations.kt");
    }

    @TestMetadata("Functions.kt")
    public void testFunctions() throws Exception {
        runTest("idea/testData/resolve/resolveModeComparison/Functions.kt");
    }

    @TestMetadata("NestedFunctions.kt")
    public void testNestedFunctions() throws Exception {
        runTest("idea/testData/resolve/resolveModeComparison/NestedFunctions.kt");
    }
}
