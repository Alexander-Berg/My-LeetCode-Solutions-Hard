import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
/**
 *
 * @author <Alexander Berg>
 * @since <pre>May 2, 2023</pre>
 * @version 1.0
 */

public class SerializeDeserializeBinaryTreeTest {
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testSerializeDeserializeSingleNodeTree() {
        SerializeDeserializeBinaryTree codec = new SerializeDeserializeBinaryTree();
        SerializeDeserializeBinaryTree.TreeNode root = codec.new TreeNode(5);
        String serialized = codec.new Codec().serialize(root);
        SerializeDeserializeBinaryTree.TreeNode deserialized = codec.new Codec().deserialize(serialized);
        assertEquals(root.val, deserialized.val);
        assertNull(deserialized.left);
        assertNull(deserialized.right);
    }

    @Test
    public void testSerializeDeserializeFullBinaryTree() {
        SerializeDeserializeBinaryTree codec = new SerializeDeserializeBinaryTree();
        SerializeDeserializeBinaryTree.TreeNode root = codec.new TreeNode(1);
        root.left = codec.new TreeNode(2);
        root.right = codec.new TreeNode(3);
        root.left.left = codec.new TreeNode(4);
        root.left.right = codec.new TreeNode(5);
        root.right.left = codec.new TreeNode(6);
        root.right.right = codec.new TreeNode(7);
        String serialized = codec.new Codec().serialize(root);
        SerializeDeserializeBinaryTree.TreeNode deserialized = codec.new Codec().deserialize(serialized);
        assertEquals(root.val, deserialized.val);
        assertEquals(root.left.val, deserialized.left.val);
        assertEquals(root.right.val, deserialized.right.val);
        assertEquals(root.left.left.val, deserialized.left.left.val);
        assertEquals(root.left.right.val, deserialized.left.right.val);
        assertEquals(root.right.left.val, deserialized.right.left.val);
        assertEquals(root.right.right.val, deserialized.right.right.val);
    }

    @Test
    public void testSerializeDeserializeIncompleteBinaryTree() {
        SerializeDeserializeBinaryTree codec = new SerializeDeserializeBinaryTree();
        SerializeDeserializeBinaryTree.TreeNode root = codec.new TreeNode(1);
        root.left = codec.new TreeNode(2);
        root.right = codec.new TreeNode(3);
        root.left.right = codec.new TreeNode(4);
        root.right.left = codec.new TreeNode(5);
        String serialized = codec.new Codec().serialize(root);
        SerializeDeserializeBinaryTree.TreeNode deserialized = codec.new Codec().deserialize(serialized);
        assertEquals(root.val, deserialized.val);
        assertEquals(root.left.val, deserialized.left.val);
        assertEquals(root.right.val, deserialized.right.val);
        assertNull(deserialized.left.left);
        assertEquals(root.left.right.val, deserialized.left.right.val);
        assertEquals(root.right.left.val, deserialized.right.left.val);
        assertNull(deserialized.right.right);
    }
}

