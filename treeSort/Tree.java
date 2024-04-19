package treeSort;

class Tree {

    public Tree left;
    public Tree right;
    public int key;

    public Tree(int k) {        // конструктор с инициализацией ключа
        key = k;
    }

    public void insert( Tree aTree) {
        if ( aTree.key < key )
            if ( left != null ) left.insert( aTree );
            else left = aTree;

        else
        if ( right != null ) right.insert( aTree );
        else right = aTree;
    }

    static int traverseCount = 0;
    public void traverse(int[] newArr) {
        if (left != null) left.traverse(newArr);

        newArr[traverseCount] = this.key;

        if(traverseCount < newArr.length - 1) traverseCount++;

        if (right != null) right.traverse(newArr);
    }
}


