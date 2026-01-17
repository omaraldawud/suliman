#!/bin/bash


#Create a shell script that backups up the contents of the /test directory into a single archive file named test.tgz and 
# save it to the current folder.

my_bk_dir=/students
archive_name=mybackup.tgz           #output backup
out_dir=/tmp

echo "Backing up to $my_bk_dir..."
# tar -zcf  /tmp/mybackup.tgz           /students
tar -zcf    $out_dir/$archive_name $my_bk_dir

# #
# echo "Backing up..."
# tar zcf /tmp/bkups/test_v1.tgz ./test/ 2>/dev/null

# # tar zcf new_file.tgz   "files or folders to zip" 

# sync
# echo "Done."``


# Version 2: add variables
# backup_dir=/tmp/bkups               # this is the directory where i store the new bkup files
# backup_file=backup_v3.tgz           # the namw of the new backup file

# files=/t/suliman/os-linux/test/     # is the file or directory i am backing up

# echo "Backing up to $backup_file..."
# tar -zcf "${backup_dir}/${backup_file}" ${files} 2>/dev/null
# sync
# echo "Done."
