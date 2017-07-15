package com.hackerrank

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class AppendAndDeleteKtTest {

    @Test
    fun shouldBeAbleToTransform() {
        assertTrue(canTransform("hackerhappy", "hackerrank", 9))
    }

    @Test
    fun shouldBeAbleToTransformToo() {
        assertTrue(canTransform("aba", "aba", 7))
    }

    @Test
    fun shouldBeAbleToTransformToo2() {
        assertTrue(canTransform("zzzzz", "zzzzzzz", 4))
    }

    @Test
    fun shouldBeAbleToTransformToo3() {
        assertTrue(canTransform("asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv", "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv", 20))
    }

    @Test
    fun shouldBeAbleToTransformToo4() {
        assertTrue(canTransform("aaa", "a", 5))
    }

    @Test
    fun shouldBeAbleToTransformToo5() {
        assertTrue(canTransform("abcdef", "fedcba", 15))
    }

    @Test
    fun shouldNotBeAbleToTransform() {
        assertFalse(canTransform("abcd", "abcdert", 10))
    }

    @Test
    fun shouldNotBeAbleToTransformToo() {
        assertFalse(canTransform("qwerasdf", "qwerbsdf", 6))
    }
}
