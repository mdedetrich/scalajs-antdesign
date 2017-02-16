package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}
import org.scalajs.dom.Event

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object, |}

/**
  * @see https://ant.design/components/tree/#API
  * @param multiple Whether allow to select multiple treeNodes
  * @param checkable Whether support add Checkbox before treeNode
  * @param defaultExpandAll Whether default to expand all treeNodes
  * @param defaultExpandedKeys Specify keys of default expanded treeNodes
  * @param expandedKeys (controlled) Specifies keys of expanded treeNodes
  * @param autoExpandParent Whether to automatically expand a parent treeNode
  * @param defaultCheckedKeys Specifies keys of default checked treeNodes
  * @param checkedKeys (controlled) Specifies keys of checked treeNodes（PS： When specifies a key of treeNode which is a parent treeNode, all children treeNodes of its will be checked; And vice versa, when specifies a key of treeNode which is a child treeNode, its parent treeNode will also be checked. When [[checkable]] and [[checkStrictly]] is true, it'a object has checked and halfChecked property, and no matter child treeNode or parent treeNode is checked, they won't impact on eachother.
  * @param checkStrictly Check treeNode precisely, parent treeNode and children treeNodes are not associated
  * @param defaultSelectedKeys Specifies keys of default selected treeNodes
  * @param selectedKeys (controlled) Specifies keys of selected treeNode
  * @param onExpand Defines a function will be called when expand or collapse a treeNode
  * @param onCheck Defines a function will be called when the onCheck event occurs
  * @param onSelect The callback will be invoked when the user clicks a treeNode
  * @param filterTreeNode Defines a function to filter treeNodes（highlight），when return true, corresponding treeNode will be highlight
  * @param loadData load data asynchronously
  * @param onRightClick The call back will be invoked when the user right clicks a treeNode
  * @param draggable Specifies whether this Tree is draggable（IE>8）
  * @param onDragStart Defines a function will be called when the onDragStart event occurs
  * @param onDragEnter Defines a function will be called when the onDragEnter event occurs
  * @param onDragOver Defines a function will be called when the onDragOver event occurs
  * @param onDragLeave Defines a function will be called when the onDragLeave event occurs
  * @param onDragEnd Defines a function will be called when the onDragEnd event occurs
  * @param onDrop Defines a function will be called when the onDrop event occurs
  */

case class Tree(multiple: js.UndefOr[Boolean] = js.undefined,
                checkable: js.UndefOr[Boolean] = js.undefined,
                defaultExpandAll: js.UndefOr[Boolean] = js.undefined,
                defaultExpandedKeys: js.UndefOr[js.Array[String]] = js.undefined,
                expandedKeys: js.UndefOr[js.Array[String]] = js.undefined,
                autoExpandParent: js.UndefOr[Boolean] = js.undefined,
                defaultCheckedKeys: js.UndefOr[js.Array[String]] = js.undefined,
                checkedKeys: js.UndefOr[js.Array[String] | js.Dictionary[js.Any]] = js.undefined,
                checkStrictly: js.UndefOr[Boolean] = js.undefined,
                defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.undefined,
                selectedKeys: js.UndefOr[js.Array[String]] = js.undefined,
                onExpand: js.UndefOr[js.Dictionary[js.Any] => CallbackTo[Unit]] = js.undefined,
                onCheck: js.UndefOr[js.Dictionary[js.Any] => CallbackTo[Unit]] = js.undefined,
                onSelect: js.UndefOr[js.Dictionary[js.Any] => CallbackTo[Unit]] = js.undefined,
                filterTreeNode: js.UndefOr[js.Dictionary[js.Any] => CallbackTo[Boolean]] = js.undefined,
                loadData: js.UndefOr[Boolean] = js.undefined,
                onRightClick: js.UndefOr[(Event, ReactNode) => CallbackTo[Unit]] = js.undefined,
                draggable: js.UndefOr[Boolean] = js.undefined,
                onDragStart: js.UndefOr[(Event, ReactNode) => CallbackTo[Unit]] = js.undefined,
                onDragEnter: js.UndefOr[(Event, ReactNode, js.Array[String]) => CallbackTo[Unit]] = js.undefined,
                onDragOver: js.UndefOr[(Event, ReactNode) => CallbackTo[Unit]] = js.undefined,
                onDragLeave: js.UndefOr[(Event, ReactNode) => CallbackTo[Unit]] = js.undefined,
                onDragEnd: js.UndefOr[(Event, ReactNode) => CallbackTo[Unit]] = js.undefined,
                onDrop: js.UndefOr[(Event, ReactNode, ReactNode, js.Array[String]) => CallbackTo[Unit]] = js.undefined) {

  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    multiple.foreach { x =>
      p.updateDynamic("multiple")(x)
    }
    checkable.foreach { x =>
      p.updateDynamic("checkable")(x)
    }
    defaultExpandAll.foreach { x =>
      p.updateDynamic("defaultExpandAll")(x)
    }
    defaultExpandedKeys.foreach { x =>
      p.updateDynamic("defaultExpandedKeys")(x)
    }
    expandedKeys.foreach { x =>
      p.updateDynamic("expandedKeys")(x)
    }
    autoExpandParent.foreach { x =>
      p.updateDynamic("autoExpandParent")(x)
    }
    defaultCheckedKeys.foreach { x =>
      p.updateDynamic("defaultCheckedKeys")(x)
    }
    checkedKeys.foreach { x =>
      p.updateDynamic("checkedKeys")(x.asInstanceOf[js.Any])
    }
    checkStrictly.foreach { x =>
      p.updateDynamic("checkStrictly")(x)
    }
    defaultSelectedKeys.foreach { x =>
      p.updateDynamic("defaultSelectedKeys")(x)
    }
    selectedKeys.foreach { x =>
      p.updateDynamic("selectedKeys")(x)
    }
    onExpand.foreach { x =>
      p.updateDynamic("onExpand")(
        (v1: js.Dictionary[js.Any]) => x(v1).runNow()
      )
    }
    onCheck.foreach { x =>
      p.updateDynamic("onCheck")(
        (v1: js.Dictionary[js.Any]) => x(v1).runNow()
      )
    }
    onSelect.foreach { x =>
      p.updateDynamic("onSelect")(
        (v1: js.Dictionary[js.Any]) => x(v1).runNow()
      )
    }
    filterTreeNode.foreach { x =>
      p.updateDynamic("filterTreeNode")(
        (v1: js.Dictionary[js.Any]) => x(v1).runNow()
      )
    }
    loadData.foreach { x =>
      p.updateDynamic("loadData")(x)
    }
    onRightClick.foreach { x =>
      p.updateDynamic("onRightClick")(
        (v1: Event, v2: ReactNode) => x(v1, v2).runNow()
      )
    }
    draggable.foreach { x =>
      p.updateDynamic("draggable")(x)
    }
    onDragStart.foreach { x =>
      p.updateDynamic("onDragStart")(
        (v1: Event, v2: ReactNode) => x(v1, v2).runNow()
      )
    }
    onDragEnter.foreach { x =>
      p.updateDynamic("onDragEnter")(
        (v1: Event, v2: ReactNode, v3: js.Array[String]) => x(v1, v2, v3).runNow()
      )
    }
    onDragOver.foreach { x =>
      p.updateDynamic("onDragOver")(
        (v1: Event, v2: ReactNode) => x(v1, v2).runNow()
      )
    }
    onDragLeave.foreach { x =>
      p.updateDynamic("onDragLeave")(
        (v1: Event, v2: ReactNode) => x(v1, v2).runNow()
      )
    }
    onDragEnd.foreach { x =>
      p.updateDynamic("onDragEnd")(
        (v1: Event, v2: ReactNode) => x(v1, v2).runNow()
      )
    }
    onDrop.foreach { x =>
      p.updateDynamic("onDrop")(
        (v1: Event, v2: ReactNode, v3: ReactNode, v4: js.Array[String]) => x(v1, v2, v3, v4).runNow()
      )
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Tree)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Tree {

  /**
    * @see https://ant.design/components/tree/#TreeNode-props
    * @param disabled whether disabled the treeNode
    * @param disableCheckbox whether disable the checkbox of treeNode
    * @param title title
    * @param key it's used with (default)ExpandedKeys / (default)CheckedKeys / (default)SelectedKeys. P.S.: it must be unique in all of treeNodes of the tree!
    * @param isLeaf whether it's leaf node
    */

  case class TreeNode(disabled: js.UndefOr[Boolean] = js.undefined,
                      disableCheckbox: js.UndefOr[Boolean] = js.undefined,
                      title: js.UndefOr[String | ReactNode] = js.undefined,
                      key: js.UndefOr[String] = js.undefined,
                      isLeaf: js.UndefOr[Boolean] = js.undefined) {
    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      disabled.foreach { x =>
        p.updateDynamic("disabled")(x)
      }
      disableCheckbox.foreach { x =>
        p.updateDynamic("disableCheckbox")(x)
      }
      title.foreach { x =>
        p.updateDynamic("title")(x.asInstanceOf[js.Any])
      }
      key.foreach { x =>
        p.updateDynamic("key")(x)
      }
      isLeaf.foreach { x =>
        p.updateDynamic("isLeaf")(x)
      }
      p
    }

    def apply(children: ReactNode*): ReactComponentU_ = {
      val f =
        React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Tree.TreeNode)
      f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
    }
  }
}
