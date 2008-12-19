package de.unisb.cs.st.javaslicer.dependencyAnalysis;

import de.unisb.cs.st.javaslicer.common.classRepresentation.Instruction.Instance;
import de.unisb.cs.st.javaslicer.variables.Variable;


/**
 * An empty Implementation of the {@link DependencyVisitor} interface.
 *
 * @author Clemens Hammacher
 */
public class DependencyVisitorAdapter implements DependencyVisitor {

    public void visitControlDependency(Instance from, Instance to) {
        // null
    }

    public void visitDataDependency(Instance from, Instance to, Variable var,
            DataDependencyType type) {
        // null
    }

    public void visitInstructionExecution(Instance instance) {
        // null
    }

    public void visitPendingControlDependency(Instance to) {
        // null
    }

    public void visitPendingReadAfterWriteDependency(Instance to, Variable var) {
        // null
    }

}