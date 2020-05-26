package cn.cxzheng.tracemanplugin

class MethodFilter {

    companion object {

        fun isConstructor(methodName: String?): Boolean {
            return methodName?.contains("<init>") ?: false
        }

    }
}