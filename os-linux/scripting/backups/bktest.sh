#!/bin/bash
#
echo "Backing up..."
tar zcf /tmp/bkups/test_v1.tgz ./test 2>/dev/null
sync
echo "Done."


# # Version 2: add variables
# backup_dir=/tmp/omar
# backup_file=backup_v2.tgz
# files=/t/suliman/os-linux/test/

# echo "Backing up to $backup_file..."
# tar -zcf "${backup_dir}/${backup_file}" ${files} 2>/dev/null
# sync
# echo "Done."

