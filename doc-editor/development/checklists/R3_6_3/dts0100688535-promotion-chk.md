---

Copyright 2012 xtUML.org

---
xtUML Project Checklist
Performing Final Review

Document References
-------------------
[1] Documentation/internal/process/templates/checklists/
                                                    introducing-new-modules.chk
[2] Documentation/internal/process/standard-file-headers.txt
[3] Documentation/internal/process/coding-standards.txt
[4] Documentation/internal/process/templates/checklists/doc_final_review.chk

Checklist
---------
o- If work done under assigned issue introduces a new module/plugin then 
   execute checklist for introducing new modules[1].

o- If work done under assigned issue introduces changes to the user
   documentation in com.mentor.nucleus.bp.doc perform the doc_final_review
   checklist.
   
x- Make sure all files introduced under the assigned issue have the correct 
   ASCII/Binary properties.

x- All introduced files have standard headers and required footers [2].

x- All applicable coding standards [3] are followed.

x- All files are checked-in properly and no file is left ommitted.

x- Verify that all changes specified in the analysis, design and implementation
   note review minutes were made.

x- Verify that all work specified in the design note (or in the design section 
   of the implementation note), was done to the files specified in the Code 
   Changes section of the implementation note.  

x- Verify that any changes made to files in the Code Changes section that are 
   not traceable back to work required by the design are called out in the 
   Implementation Comments section of the implementation note.  

o- If plugin.xml or MANIFEST.MF was modified, verify all changes to the depend-
   encies and required bundles are also made to the compile target in 
   generate.xml

x- Perform a clean build and verify everything rebuilds successfully.

x- Execute all unit tests and verify that all tests pass.

x- Go to the issue in CQ and change its state from Assigned to Open

x- Add a comment in the BridgePoint chat saying the issue is ready for promotion.

End
---
